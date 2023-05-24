package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrafficMirrorFilter(id: String): CfnTrafficMirrorFilter =
    CfnTrafficMirrorFilter(this, id)

@Generated
public fun Construct.cfnTrafficMirrorFilter(id: String, initializer: @AwsCdkDsl
    CfnTrafficMirrorFilter.() -> Unit): CfnTrafficMirrorFilter = CfnTrafficMirrorFilter(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnTrafficMirrorFilter(id: String, props: CfnTrafficMirrorFilterProps):
    CfnTrafficMirrorFilter = CfnTrafficMirrorFilter(this, id, props)

@Generated
public fun Construct.cfnTrafficMirrorFilter(
  id: String,
  props: CfnTrafficMirrorFilterProps,
  initializer: @AwsCdkDsl CfnTrafficMirrorFilter.() -> Unit,
): CfnTrafficMirrorFilter = CfnTrafficMirrorFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrafficMirrorFilter(id: String, initializer: @AwsCdkDsl
    CfnTrafficMirrorFilter.Builder.() -> Unit): CfnTrafficMirrorFilter =
    CfnTrafficMirrorFilter.Builder.create(this, id).apply(initializer).build()
