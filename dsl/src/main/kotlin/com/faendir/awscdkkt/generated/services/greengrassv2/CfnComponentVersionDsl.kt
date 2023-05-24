package com.faendir.awscdkkt.generated.services.greengrassv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComponentVersion(id: String, props: CfnComponentVersionProps):
    CfnComponentVersion = CfnComponentVersion(this, id, props)

@Generated
public fun Construct.cfnComponentVersion(
  id: String,
  props: CfnComponentVersionProps,
  initializer: @AwsCdkDsl CfnComponentVersion.() -> Unit,
): CfnComponentVersion = CfnComponentVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnComponentVersion(id: String): CfnComponentVersion =
    CfnComponentVersion(this, id)

@Generated
public fun Construct.cfnComponentVersion(id: String, initializer: @AwsCdkDsl
    CfnComponentVersion.() -> Unit): CfnComponentVersion = CfnComponentVersion(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnComponentVersion(id: String, initializer: @AwsCdkDsl
    CfnComponentVersion.Builder.() -> Unit): CfnComponentVersion =
    CfnComponentVersion.Builder.create(this, id).apply(initializer).build()
