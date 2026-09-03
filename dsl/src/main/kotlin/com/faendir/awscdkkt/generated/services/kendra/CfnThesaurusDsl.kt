package com.faendir.awscdkkt.generated.services.kendra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnThesaurus
import software.amazon.awscdk.services.kendra.CfnThesaurusProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThesaurus(
  id: String,
  props: CfnThesaurusProps,
  initializer: @AwsCdkDsl CfnThesaurus.() -> Unit = {},
): CfnThesaurus = CfnThesaurus(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnThesaurus(id: String, initializer: @AwsCdkDsl CfnThesaurus.Builder.() -> Unit = {}): CfnThesaurus = CfnThesaurus.Builder.create(this, id).apply(initializer).build()
