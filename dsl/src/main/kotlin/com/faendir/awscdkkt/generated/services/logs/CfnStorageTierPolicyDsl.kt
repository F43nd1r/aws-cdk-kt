package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnStorageTierPolicy
import software.amazon.awscdk.services.logs.CfnStorageTierPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStorageTierPolicy(
  id: String,
  props: CfnStorageTierPolicyProps,
  initializer: @AwsCdkDsl CfnStorageTierPolicy.() -> Unit = {},
): CfnStorageTierPolicy = CfnStorageTierPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStorageTierPolicy(id: String, initializer: @AwsCdkDsl CfnStorageTierPolicy.Builder.() -> Unit = {}): CfnStorageTierPolicy = CfnStorageTierPolicy.Builder.create(this, id).apply(initializer).build()
