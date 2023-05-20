@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.qldb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnLedger
import software.amazon.awscdk.services.qldb.CfnLedgerProps
import software.constructs.Construct

public fun Construct.cfnLedger(
  id: String,
  props: CfnLedgerProps,
  initializer: CfnLedger.() -> Unit = {},
): CfnLedger = CfnLedger(this, id, props).apply(initializer)
