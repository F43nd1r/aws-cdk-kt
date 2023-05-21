package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.amazon.awscdk.services.macie.CfnFindingsFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFindingsFilter(
  id: String,
  props: CfnFindingsFilterProps,
  initializer: CfnFindingsFilter.() -> Unit = {},
): CfnFindingsFilter = CfnFindingsFilter(this, id, props).apply(initializer)
