package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnStandard
import software.amazon.awscdk.services.securityhub.CfnStandardProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStandard(id: String, props: CfnStandardProps): CfnStandard =
    CfnStandard(this, id, props)

@Generated
public fun Construct.cfnStandard(
  id: String,
  props: CfnStandardProps,
  initializer: @AwsCdkDsl CfnStandard.() -> Unit,
): CfnStandard = CfnStandard(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStandard(id: String, initializer: @AwsCdkDsl
    CfnStandard.Builder.() -> Unit): CfnStandard = CfnStandard.Builder.create(this,
    id).apply(initializer).build()
