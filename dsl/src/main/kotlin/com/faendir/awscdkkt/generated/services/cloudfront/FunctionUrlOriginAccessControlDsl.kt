package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControl
import software.amazon.awscdk.services.cloudfront.FunctionUrlOriginAccessControlProps
import software.constructs.Construct

@Generated
public fun Construct.functionUrlOriginAccessControl(id: String, initializer: @AwsCdkDsl
    FunctionUrlOriginAccessControl.() -> Unit = {}): FunctionUrlOriginAccessControl =
    FunctionUrlOriginAccessControl(this, id).apply(initializer)

@Generated
public fun Construct.functionUrlOriginAccessControl(
  id: String,
  props: FunctionUrlOriginAccessControlProps,
  initializer: @AwsCdkDsl FunctionUrlOriginAccessControl.() -> Unit = {},
): FunctionUrlOriginAccessControl = FunctionUrlOriginAccessControl(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildFunctionUrlOriginAccessControl(id: String, initializer: @AwsCdkDsl
    FunctionUrlOriginAccessControl.Builder.() -> Unit = {}): FunctionUrlOriginAccessControl =
    FunctionUrlOriginAccessControl.Builder.create(this, id).apply(initializer).build()
