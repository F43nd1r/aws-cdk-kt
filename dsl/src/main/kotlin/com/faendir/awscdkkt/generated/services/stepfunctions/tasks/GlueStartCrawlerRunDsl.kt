package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartCrawlerRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartCrawlerRunProps
import software.constructs.Construct

@Generated
public fun Construct.glueStartCrawlerRun(
  id: String,
  props: GlueStartCrawlerRunProps,
  initializer: @AwsCdkDsl GlueStartCrawlerRun.() -> Unit = {},
): GlueStartCrawlerRun = GlueStartCrawlerRun(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGlueStartCrawlerRun(id: String, initializer: @AwsCdkDsl
    GlueStartCrawlerRun.Builder.() -> Unit = {}): GlueStartCrawlerRun =
    GlueStartCrawlerRun.Builder.create(this, id).apply(initializer).build()
