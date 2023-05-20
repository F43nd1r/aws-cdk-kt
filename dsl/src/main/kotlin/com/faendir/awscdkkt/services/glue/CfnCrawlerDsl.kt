@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnCrawlerProps
import software.constructs.Construct

public fun Construct.cfnCrawler(
  id: String,
  props: CfnCrawlerProps,
  initializer: CfnCrawler.() -> Unit = {},
): CfnCrawler = CfnCrawler(this, id, props).apply(initializer)
