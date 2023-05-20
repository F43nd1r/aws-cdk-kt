@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnWebhook
import software.amazon.awscdk.services.codepipeline.CfnWebhookProps
import software.constructs.Construct

public fun Construct.cfnWebhook(
  id: String,
  props: CfnWebhookProps,
  initializer: CfnWebhook.() -> Unit = {},
): CfnWebhook = CfnWebhook(this, id, props).apply(initializer)
