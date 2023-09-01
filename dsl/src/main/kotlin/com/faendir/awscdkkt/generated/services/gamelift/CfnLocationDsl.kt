package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnLocation
import software.amazon.awscdk.services.gamelift.CfnLocationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocation(
  id: String,
  props: CfnLocationProps,
  initializer: @AwsCdkDsl CfnLocation.() -> Unit = {},
): CfnLocation = CfnLocation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocation(id: String, initializer: @AwsCdkDsl
    CfnLocation.Builder.() -> Unit = {}): CfnLocation = CfnLocation.Builder.create(this,
    id).apply(initializer).build()
