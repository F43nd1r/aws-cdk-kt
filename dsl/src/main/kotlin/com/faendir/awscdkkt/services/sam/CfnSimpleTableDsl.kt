@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps
import software.constructs.Construct

public fun Construct.cfnSimpleTable(id: String, initializer: CfnSimpleTable.() -> Unit = {}):
    CfnSimpleTable = CfnSimpleTable(this, id).apply(initializer)

public fun Construct.cfnSimpleTable(
  id: String,
  props: CfnSimpleTableProps,
  initializer: CfnSimpleTable.() -> Unit = {},
): CfnSimpleTable = CfnSimpleTable(this, id, props).apply(initializer)
