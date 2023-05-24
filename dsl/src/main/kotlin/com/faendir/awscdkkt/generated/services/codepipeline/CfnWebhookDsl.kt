package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.amazon.awscdk.services.codepipeline.CfnWebhookProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWebhook(id: String, props: CfnWebhookProps): CfnWebhook = CfnWebhook(this,
    id, props)

@Generated
public fun Construct.cfnWebhook(
  id: String,
  props: CfnWebhookProps,
  initializer: @AwsCdkDsl CfnWebhook.() -> Unit,
): CfnWebhook = CfnWebhook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWebhook(id: String, initializer: @AwsCdkDsl
    CfnWebhook.Builder.() -> Unit): CfnWebhook = CfnWebhook.Builder.create(this,
    id).apply(initializer).build()
