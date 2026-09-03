package com.faendir.awscdkkt.generated.services.kendra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnQuerySuggestionsBlockList
import software.amazon.awscdk.services.kendra.CfnQuerySuggestionsBlockListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQuerySuggestionsBlockList(
  id: String,
  props: CfnQuerySuggestionsBlockListProps,
  initializer: @AwsCdkDsl CfnQuerySuggestionsBlockList.() -> Unit = {},
): CfnQuerySuggestionsBlockList = CfnQuerySuggestionsBlockList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQuerySuggestionsBlockList(id: String, initializer: @AwsCdkDsl CfnQuerySuggestionsBlockList.Builder.() -> Unit = {}): CfnQuerySuggestionsBlockList = CfnQuerySuggestionsBlockList.Builder.create(this, id).apply(initializer).build()
