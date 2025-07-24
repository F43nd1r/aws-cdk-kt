package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.JsonMutatorProcessor

@Generated
public fun buildJsonMutatorProcessor(initializer: @AwsCdkDsl JsonMutatorProcessor.Builder.() -> Unit = {}): JsonMutatorProcessor = JsonMutatorProcessor.Builder.create().apply(initializer).build()
