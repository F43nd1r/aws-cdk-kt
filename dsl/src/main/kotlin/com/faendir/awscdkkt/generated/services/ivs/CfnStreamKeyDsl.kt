package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnStreamKey
import software.amazon.awscdk.services.ivs.CfnStreamKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStreamKey(id: String, props: CfnStreamKeyProps): CfnStreamKey =
    CfnStreamKey(this, id, props)

@Generated
public fun Construct.cfnStreamKey(
  id: String,
  props: CfnStreamKeyProps,
  initializer: @AwsCdkDsl CfnStreamKey.() -> Unit,
): CfnStreamKey = CfnStreamKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStreamKey(id: String, initializer: @AwsCdkDsl
    CfnStreamKey.Builder.() -> Unit): CfnStreamKey = CfnStreamKey.Builder.create(this,
    id).apply(initializer).build()
