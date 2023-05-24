package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnUser
import software.amazon.awscdk.services.elasticache.CfnUserProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUser(id: String, props: CfnUserProps): CfnUser = CfnUser(this, id, props)

@Generated
public fun Construct.cfnUser(
  id: String,
  props: CfnUserProps,
  initializer: @AwsCdkDsl CfnUser.() -> Unit,
): CfnUser = CfnUser(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUser(id: String, initializer: @AwsCdkDsl CfnUser.Builder.() -> Unit):
    CfnUser = CfnUser.Builder.create(this, id).apply(initializer).build()
