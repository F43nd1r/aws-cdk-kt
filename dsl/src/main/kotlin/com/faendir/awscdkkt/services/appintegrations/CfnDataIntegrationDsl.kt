package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataIntegration(
  id: String,
  props: CfnDataIntegrationProps,
  initializer: CfnDataIntegration.() -> Unit = {},
): CfnDataIntegration = CfnDataIntegration(this, id, props).apply(initializer)
