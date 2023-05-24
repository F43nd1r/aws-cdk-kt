package com.faendir.awscdkkt.generated.services.frauddetector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnList
import software.amazon.awscdk.services.frauddetector.CfnListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnList(id: String, props: CfnListProps): CfnList = CfnList(this, id, props)

@Generated
public fun Construct.cfnList(
  id: String,
  props: CfnListProps,
  initializer: @AwsCdkDsl CfnList.() -> Unit,
): CfnList = CfnList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnList(id: String, initializer: @AwsCdkDsl CfnList.Builder.() -> Unit):
    CfnList = CfnList.Builder.create(this, id).apply(initializer).build()
