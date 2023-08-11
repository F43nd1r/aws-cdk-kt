package com.faendir.awscdkkt.generated.services.mediatailor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation
import software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSourceLocation(id: String, props: CfnSourceLocationProps): CfnSourceLocation
    = CfnSourceLocation(this, id, props)

@Generated
public fun Construct.cfnSourceLocation(
  id: String,
  props: CfnSourceLocationProps,
  initializer: @AwsCdkDsl CfnSourceLocation.() -> Unit,
): CfnSourceLocation = CfnSourceLocation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSourceLocation(id: String, initializer: @AwsCdkDsl
    CfnSourceLocation.Builder.() -> Unit): CfnSourceLocation =
    CfnSourceLocation.Builder.create(this, id).apply(initializer).build()
