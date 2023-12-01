package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnAccessGrantsLocation
import software.amazon.awscdk.services.s3.CfnAccessGrantsLocationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessGrantsLocation(id: String, initializer: @AwsCdkDsl
    CfnAccessGrantsLocation.() -> Unit = {}): CfnAccessGrantsLocation =
    CfnAccessGrantsLocation(this, id).apply(initializer)

@Generated
public fun Construct.cfnAccessGrantsLocation(
  id: String,
  props: CfnAccessGrantsLocationProps,
  initializer: @AwsCdkDsl CfnAccessGrantsLocation.() -> Unit = {},
): CfnAccessGrantsLocation = CfnAccessGrantsLocation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessGrantsLocation(id: String, initializer: @AwsCdkDsl
    CfnAccessGrantsLocation.Builder.() -> Unit = {}): CfnAccessGrantsLocation =
    CfnAccessGrantsLocation.Builder.create(this, id).apply(initializer).build()
