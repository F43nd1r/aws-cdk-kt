package com.faendir.awscdkkt.generated.services.efs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.AccessPointProps
import software.constructs.Construct

@Generated
public fun Construct.accessPoint(id: String, props: AccessPointProps): AccessPoint =
    AccessPoint(this, id, props)

@Generated
public fun Construct.accessPoint(
  id: String,
  props: AccessPointProps,
  initializer: @AwsCdkDsl AccessPoint.() -> Unit,
): AccessPoint = AccessPoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAccessPoint(id: String, initializer: @AwsCdkDsl
    AccessPoint.Builder.() -> Unit): AccessPoint = AccessPoint.Builder.create(this,
    id).apply(initializer).build()
