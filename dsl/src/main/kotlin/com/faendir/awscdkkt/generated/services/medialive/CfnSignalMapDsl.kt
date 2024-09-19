package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnSignalMap
import software.amazon.awscdk.services.medialive.CfnSignalMapProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSignalMap(
  id: String,
  props: CfnSignalMapProps,
  initializer: @AwsCdkDsl CfnSignalMap.() -> Unit = {},
): CfnSignalMap = CfnSignalMap(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSignalMap(id: String, initializer: @AwsCdkDsl
    CfnSignalMap.Builder.() -> Unit = {}): CfnSignalMap = CfnSignalMap.Builder.create(this,
    id).apply(initializer).build()
