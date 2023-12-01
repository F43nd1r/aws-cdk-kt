package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnAccessGrantsInstance
import software.amazon.awscdk.services.s3.CfnAccessGrantsInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessGrantsInstance(id: String, initializer: @AwsCdkDsl
    CfnAccessGrantsInstance.() -> Unit = {}): CfnAccessGrantsInstance =
    CfnAccessGrantsInstance(this, id).apply(initializer)

@Generated
public fun Construct.cfnAccessGrantsInstance(
  id: String,
  props: CfnAccessGrantsInstanceProps,
  initializer: @AwsCdkDsl CfnAccessGrantsInstance.() -> Unit = {},
): CfnAccessGrantsInstance = CfnAccessGrantsInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccessGrantsInstance(id: String, initializer: @AwsCdkDsl
    CfnAccessGrantsInstance.Builder.() -> Unit = {}): CfnAccessGrantsInstance =
    CfnAccessGrantsInstance.Builder.create(this, id).apply(initializer).build()
