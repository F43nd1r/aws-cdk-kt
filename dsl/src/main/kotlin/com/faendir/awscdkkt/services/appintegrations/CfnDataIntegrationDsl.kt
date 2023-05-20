@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
