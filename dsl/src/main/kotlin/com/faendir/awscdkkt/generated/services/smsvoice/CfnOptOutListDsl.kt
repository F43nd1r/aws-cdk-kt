package com.faendir.awscdkkt.generated.services.smsvoice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.smsvoice.CfnOptOutList
import software.amazon.awscdk.services.smsvoice.CfnOptOutListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOptOutList(id: String, initializer: @AwsCdkDsl CfnOptOutList.() -> Unit = {}): CfnOptOutList = CfnOptOutList(this, id).apply(initializer)

@Generated
public fun Construct.cfnOptOutList(
  id: String,
  props: CfnOptOutListProps,
  initializer: @AwsCdkDsl CfnOptOutList.() -> Unit = {},
): CfnOptOutList = CfnOptOutList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOptOutList(id: String, initializer: @AwsCdkDsl CfnOptOutList.Builder.() -> Unit = {}): CfnOptOutList = CfnOptOutList.Builder.create(this, id).apply(initializer).build()
