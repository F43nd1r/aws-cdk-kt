package com.faendir.awscdkkt.generated.services.macie

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnFindingsFilter.() -> Unit = {},
): CfnFindingsFilter = CfnFindingsFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFindingsFilter(id: String, initializer: @AwsCdkDsl
    CfnFindingsFilter.Builder.() -> Unit = {}): CfnFindingsFilter =
    CfnFindingsFilter.Builder.create(this, id).apply(initializer).build()
