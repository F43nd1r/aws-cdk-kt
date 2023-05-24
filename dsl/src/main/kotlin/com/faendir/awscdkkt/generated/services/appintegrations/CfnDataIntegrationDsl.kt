package com.faendir.awscdkkt.generated.services.appintegrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration
import software.amazon.awscdk.services.appintegrations.CfnDataIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataIntegration(id: String, props: CfnDataIntegrationProps):
    CfnDataIntegration = CfnDataIntegration(this, id, props)

@Generated
public fun Construct.cfnDataIntegration(
  id: String,
  props: CfnDataIntegrationProps,
  initializer: @AwsCdkDsl CfnDataIntegration.() -> Unit,
): CfnDataIntegration = CfnDataIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataIntegration(id: String, initializer: @AwsCdkDsl
    CfnDataIntegration.Builder.() -> Unit): CfnDataIntegration =
    CfnDataIntegration.Builder.create(this, id).apply(initializer).build()
