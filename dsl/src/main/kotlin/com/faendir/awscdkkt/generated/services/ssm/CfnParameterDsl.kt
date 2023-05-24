package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnParameter
import software.amazon.awscdk.services.ssm.CfnParameterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnParameter(id: String, props: CfnParameterProps): CfnParameter =
    CfnParameter(this, id, props)

@Generated
public fun Construct.cfnParameter(
  id: String,
  props: CfnParameterProps,
  initializer: @AwsCdkDsl CfnParameter.() -> Unit,
): CfnParameter = CfnParameter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnParameter(id: String, initializer: @AwsCdkDsl
    CfnParameter.Builder.() -> Unit): CfnParameter = CfnParameter.Builder.create(this,
    id).apply(initializer).build()
