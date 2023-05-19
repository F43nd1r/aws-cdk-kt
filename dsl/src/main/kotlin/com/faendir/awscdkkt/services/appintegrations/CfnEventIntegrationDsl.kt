@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps
import software.constructs.Construct

public fun Construct.cfnEventIntegration(
  id: String,
  props: CfnEventIntegrationProps,
  initializer: CfnEventIntegration.() -> Unit = {},
): CfnEventIntegration = CfnEventIntegration(this, id, props).apply(initializer)
