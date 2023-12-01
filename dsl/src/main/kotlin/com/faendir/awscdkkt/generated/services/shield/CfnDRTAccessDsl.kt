package com.faendir.awscdkkt.generated.services.shield

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnDRTAccess
import software.amazon.awscdk.services.shield.CfnDRTAccessProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDRTAccess(
  id: String,
  props: CfnDRTAccessProps,
  initializer: @AwsCdkDsl CfnDRTAccess.() -> Unit = {},
): CfnDRTAccess = CfnDRTAccess(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDRTAccess(id: String, initializer: @AwsCdkDsl
    CfnDRTAccess.Builder.() -> Unit = {}): CfnDRTAccess = CfnDRTAccess.Builder.create(this,
    id).apply(initializer).build()
