package com.faendir.awscdkkt.generated.services.redshiftserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkgroup(id: String, props: CfnWorkgroupProps): CfnWorkgroup =
    CfnWorkgroup(this, id, props)

@Generated
public fun Construct.cfnWorkgroup(
  id: String,
  props: CfnWorkgroupProps,
  initializer: @AwsCdkDsl CfnWorkgroup.() -> Unit,
): CfnWorkgroup = CfnWorkgroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkgroup(id: String, initializer: @AwsCdkDsl
    CfnWorkgroup.Builder.() -> Unit): CfnWorkgroup = CfnWorkgroup.Builder.create(this,
    id).apply(initializer).build()
