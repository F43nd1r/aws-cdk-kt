package com.faendir.awscdkkt.generated.services.directoryservice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSimpleAD(
  id: String,
  props: CfnSimpleADProps,
  initializer: @AwsCdkDsl CfnSimpleAD.() -> Unit = {},
): CfnSimpleAD = CfnSimpleAD(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSimpleAD(id: String, initializer: @AwsCdkDsl
    CfnSimpleAD.Builder.() -> Unit = {}): CfnSimpleAD = CfnSimpleAD.Builder.create(this,
    id).apply(initializer).build()
