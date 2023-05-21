package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnCrawlerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCrawler(
  id: String,
  props: CfnCrawlerProps,
  initializer: CfnCrawler.() -> Unit = {},
): CfnCrawler = CfnCrawler(this, id, props).apply(initializer)
