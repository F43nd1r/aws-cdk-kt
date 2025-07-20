package com.faendir.awscdkkt.generated.services.appintegrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventIntegration(
  id: String,
  props: CfnEventIntegrationProps,
  initializer: @AwsCdkDsl CfnEventIntegration.() -> Unit = {},
): CfnEventIntegration = CfnEventIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventIntegration(id: String, initializer: @AwsCdkDsl CfnEventIntegration.Builder.() -> Unit = {}): CfnEventIntegration = CfnEventIntegration.Builder.create(this, id).apply(initializer).build()
