package com.example.promota.presentation.components.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProductItem(
    onItemClicked:()->Unit
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 5.dp)
            .background(MaterialTheme.colorScheme.onPrimary, shape = MaterialTheme.shapes.medium)
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                onItemClicked.invoke()
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.onPrimary),
        ) {
            ProductItemHeader()
            Spacer(
                Modifier
                    .padding(vertical = 10.dp)
                    .height(1.5.dp)
                    .fillMaxWidth()
                    .background(
                        color = MaterialTheme.colorScheme.tertiaryContainer,
                        shape = MaterialTheme.shapes.extraLarge
                    )
            )
            ProductItemFooter()
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun ProductItemHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.onPrimary),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource("drawable/fake_product.png"),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .background(color = Color.White, shape = MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.size(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Row(
                modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.onTertiaryContainer,
                        shape = MaterialTheme.shapes.medium
                    )
                    .padding(horizontal = 5.dp, vertical = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource("drawable/barcode.png"),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.tertiaryContainer,
                    modifier = Modifier.size(25.dp).padding(horizontal = 2.dp),
                )
                Text(
                    text = "12345666778",
                    color = MaterialTheme.colorScheme.tertiaryContainer,
                    style = MaterialTheme.typography.titleMedium.copy(fontSize = 12.sp)
                )
            }
            Text(
                text = "Domty cheese large with no salt cheese large with no salt ",
                color = MaterialTheme.colorScheme.outline,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Companion.Unspecified
                ),
                maxLines = 2
            )
        }
        Spacer(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .height(60.dp)
                .width(1.dp)
                .background(MaterialTheme.colorScheme.surface)
        )
        Column(
            modifier = Modifier.fillMaxHeight(0.1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Price : 1500",
                color = MaterialTheme.colorScheme.outline,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Companion.Unspecified
                )
            )
            Text(
                text = "QTY : 1500",
                color = MaterialTheme.colorScheme.outline,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Companion.Unspecified
                )
            )
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun ProductItemFooter() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.onPrimary),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painterResource("drawable/tag.png"),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(25.dp).background(
                    MaterialTheme.colorScheme.tertiaryContainer,
                    shape = MaterialTheme.shapes.extraLarge
                ).padding(5.dp)
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "Food",
                color = MaterialTheme.colorScheme.outline,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Companion.Unspecified
                ),
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painterResource("drawable/brand.png"),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(25.dp).background(
                    MaterialTheme.colorScheme.tertiaryContainer,
                    shape = MaterialTheme.shapes.extraLarge
                ).padding(5.dp)
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "pipce",
                color = MaterialTheme.colorScheme.outline,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Companion.Unspecified
                ),
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painterResource("drawable/unit.png"),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier.size(25.dp).background(
                    MaterialTheme.colorScheme.tertiaryContainer,
                    shape = MaterialTheme.shapes.extraLarge
                ).padding(5.dp)
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "piece",
                color = MaterialTheme.colorScheme.outline,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontSize = 14.sp,
                    lineHeight = TextUnit.Companion.Unspecified
                ),
            )
        }
    }
}
