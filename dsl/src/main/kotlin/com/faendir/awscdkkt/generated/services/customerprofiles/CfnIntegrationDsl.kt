package com.faendir.awscdkkt.generated.services.customerprofiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnIntegration
import software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIntegration(
  id: String,
  props: CfnIntegrationProps,
  initializer: @AwsCdkDsl CfnIntegration.() -> Unit = {},
): CfnIntegration = CfnIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIntegration(id: String, initializer: @AwsCdkDsl
    CfnIntegration.Builder.() -> Unit = {}): CfnIntegration = CfnIntegration.Builder.create(this,
    id).apply(initializer).build()
