package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnContactList
import software.amazon.awscdk.services.ses.CfnContactListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactList(id: String, initializer: CfnContactList.() -> Unit = {}):
    CfnContactList = CfnContactList(this, id).apply(initializer)

@Generated
public fun Construct.cfnContactList(
  id: String,
  props: CfnContactListProps,
  initializer: CfnContactList.() -> Unit = {},
): CfnContactList = CfnContactList(this, id, props).apply(initializer)
