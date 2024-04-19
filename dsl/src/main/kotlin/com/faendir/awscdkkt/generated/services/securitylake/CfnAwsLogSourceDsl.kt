package com.faendir.awscdkkt.generated.services.securitylake

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securitylake.CfnAwsLogSource
import software.amazon.awscdk.services.securitylake.CfnAwsLogSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAwsLogSource(
  id: String,
  props: CfnAwsLogSourceProps,
  initializer: @AwsCdkDsl CfnAwsLogSource.() -> Unit = {},
): CfnAwsLogSource = CfnAwsLogSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAwsLogSource(id: String, initializer: @AwsCdkDsl
    CfnAwsLogSource.Builder.() -> Unit = {}): CfnAwsLogSource = CfnAwsLogSource.Builder.create(this,
    id).apply(initializer).build()
