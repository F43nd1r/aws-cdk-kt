@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps
import software.constructs.Construct

public fun Construct.cfnDataIntegration(
  id: String,
  props: CfnDataIntegrationProps,
  initializer: CfnDataIntegration.() -> Unit = {},
): CfnDataIntegration = CfnDataIntegration(this, id, props).apply(initializer)
