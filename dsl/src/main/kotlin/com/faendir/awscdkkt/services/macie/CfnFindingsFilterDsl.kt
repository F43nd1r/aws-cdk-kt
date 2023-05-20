@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import software.amazon.awscdk.services.macie.CfnFindingsFilterProps
import software.constructs.Construct

public fun Construct.cfnFindingsFilter(
  id: String,
  props: CfnFindingsFilterProps,
  initializer: CfnFindingsFilter.() -> Unit = {},
): CfnFindingsFilter = CfnFindingsFilter(this, id, props).apply(initializer)
