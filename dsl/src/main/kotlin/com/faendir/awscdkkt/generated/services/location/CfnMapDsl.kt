package com.faendir.awscdkkt.generated.services.location

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnMapProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMap(id: String, props: CfnMapProps): CfnMap = CfnMap(this, id, props)

@Generated
public fun Construct.cfnMap(
  id: String,
  props: CfnMapProps,
  initializer: @AwsCdkDsl CfnMap.() -> Unit,
): CfnMap = CfnMap(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMap(id: String, initializer: @AwsCdkDsl CfnMap.Builder.() -> Unit):
    CfnMap = CfnMap.Builder.create(this, id).apply(initializer).build()
