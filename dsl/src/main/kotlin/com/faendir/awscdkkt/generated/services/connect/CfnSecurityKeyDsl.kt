package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnSecurityKey
import software.amazon.awscdk.services.connect.CfnSecurityKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityKey(id: String, props: CfnSecurityKeyProps): CfnSecurityKey =
    CfnSecurityKey(this, id, props)

@Generated
public fun Construct.cfnSecurityKey(
  id: String,
  props: CfnSecurityKeyProps,
  initializer: @AwsCdkDsl CfnSecurityKey.() -> Unit,
): CfnSecurityKey = CfnSecurityKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityKey(id: String, initializer: @AwsCdkDsl
    CfnSecurityKey.Builder.() -> Unit): CfnSecurityKey = CfnSecurityKey.Builder.create(this,
    id).apply(initializer).build()
