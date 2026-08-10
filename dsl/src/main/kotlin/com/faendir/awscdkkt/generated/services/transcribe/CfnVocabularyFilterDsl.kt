package com.faendir.awscdkkt.generated.services.transcribe

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transcribe.CfnVocabularyFilter
import software.amazon.awscdk.services.transcribe.CfnVocabularyFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVocabularyFilter(
  id: String,
  props: CfnVocabularyFilterProps,
  initializer: @AwsCdkDsl CfnVocabularyFilter.() -> Unit = {},
): CfnVocabularyFilter = CfnVocabularyFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVocabularyFilter(id: String, initializer: @AwsCdkDsl CfnVocabularyFilter.Builder.() -> Unit = {}): CfnVocabularyFilter = CfnVocabularyFilter.Builder.create(this, id).apply(initializer).build()
