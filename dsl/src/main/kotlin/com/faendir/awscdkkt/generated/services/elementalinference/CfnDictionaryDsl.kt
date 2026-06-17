package com.faendir.awscdkkt.generated.services.elementalinference

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elementalinference.CfnDictionary
import software.amazon.awscdk.services.elementalinference.CfnDictionaryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDictionary(
  id: String,
  props: CfnDictionaryProps,
  initializer: @AwsCdkDsl CfnDictionary.() -> Unit = {},
): CfnDictionary = CfnDictionary(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDictionary(id: String, initializer: @AwsCdkDsl CfnDictionary.Builder.() -> Unit = {}): CfnDictionary = CfnDictionary.Builder.create(this, id).apply(initializer).build()
