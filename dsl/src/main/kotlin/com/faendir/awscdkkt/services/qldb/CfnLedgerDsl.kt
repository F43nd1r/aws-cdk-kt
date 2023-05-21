package com.faendir.awscdkkt.services.qldb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnLedger
import software.amazon.awscdk.services.qldb.CfnLedgerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLedger(
  id: String,
  props: CfnLedgerProps,
  initializer: CfnLedger.() -> Unit = {},
): CfnLedger = CfnLedger(this, id, props).apply(initializer)
