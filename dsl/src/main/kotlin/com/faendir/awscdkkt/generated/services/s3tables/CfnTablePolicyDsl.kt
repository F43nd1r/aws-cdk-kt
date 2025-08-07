package com.faendir.awscdkkt.generated.services.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3tables.CfnTablePolicy
import software.amazon.awscdk.services.s3tables.CfnTablePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTablePolicy(
  id: String,
  props: CfnTablePolicyProps,
  initializer: @AwsCdkDsl CfnTablePolicy.() -> Unit = {},
): CfnTablePolicy = CfnTablePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTablePolicy(id: String, initializer: @AwsCdkDsl CfnTablePolicy.Builder.() -> Unit = {}): CfnTablePolicy = CfnTablePolicy.Builder.create(this, id).apply(initializer).build()
