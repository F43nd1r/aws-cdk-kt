package com.faendir.awscdkkt.generated.services.customerprofiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnObjectType(id: String, props: CfnObjectTypeProps): CfnObjectType =
    CfnObjectType(this, id, props)

@Generated
public fun Construct.cfnObjectType(
  id: String,
  props: CfnObjectTypeProps,
  initializer: @AwsCdkDsl CfnObjectType.() -> Unit,
): CfnObjectType = CfnObjectType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnObjectType(id: String, initializer: @AwsCdkDsl
    CfnObjectType.Builder.() -> Unit): CfnObjectType = CfnObjectType.Builder.create(this,
    id).apply(initializer).build()
