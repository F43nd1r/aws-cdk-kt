package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnContactList
import software.amazon.awscdk.services.ses.CfnContactListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactList(id: String): CfnContactList = CfnContactList(this, id)

@Generated
public fun Construct.cfnContactList(id: String, initializer: @AwsCdkDsl CfnContactList.() -> Unit):
    CfnContactList = CfnContactList(this, id).apply(initializer)

@Generated
public fun Construct.cfnContactList(id: String, props: CfnContactListProps): CfnContactList =
    CfnContactList(this, id, props)

@Generated
public fun Construct.cfnContactList(
  id: String,
  props: CfnContactListProps,
  initializer: @AwsCdkDsl CfnContactList.() -> Unit,
): CfnContactList = CfnContactList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactList(id: String, initializer: @AwsCdkDsl
    CfnContactList.Builder.() -> Unit): CfnContactList = CfnContactList.Builder.create(this,
    id).apply(initializer).build()
