package com.faendir.awscdkkt.generated.services.amplify

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnWebhook
import software.amazon.awscdk.services.amplify.CfnWebhookProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWebhook(
  id: String,
  props: CfnWebhookProps,
  initializer: @AwsCdkDsl CfnWebhook.() -> Unit = {},
): CfnWebhook = CfnWebhook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWebhook(id: String, initializer: @AwsCdkDsl CfnWebhook.Builder.() -> Unit = {}): CfnWebhook = CfnWebhook.Builder.create(this, id).apply(initializer).build()
