package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler
import software.amazon.awscdk.services.glue.CfnCrawlerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCrawler(id: String, props: CfnCrawlerProps): CfnCrawler = CfnCrawler(this,
    id, props)

@Generated
public fun Construct.cfnCrawler(
  id: String,
  props: CfnCrawlerProps,
  initializer: @AwsCdkDsl CfnCrawler.() -> Unit,
): CfnCrawler = CfnCrawler(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCrawler(id: String, initializer: @AwsCdkDsl
    CfnCrawler.Builder.() -> Unit): CfnCrawler = CfnCrawler.Builder.create(this,
    id).apply(initializer).build()
