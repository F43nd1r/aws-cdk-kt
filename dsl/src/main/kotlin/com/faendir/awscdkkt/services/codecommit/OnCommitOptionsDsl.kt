package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.OnCommitOptions

@Generated
public fun onCommitOptions(initializer: OnCommitOptions.Builder.() -> Unit = {}): OnCommitOptions =
    OnCommitOptions.builder().apply(initializer).build()
