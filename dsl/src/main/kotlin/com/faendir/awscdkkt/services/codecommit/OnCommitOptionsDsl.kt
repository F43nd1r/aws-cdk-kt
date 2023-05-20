@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.OnCommitOptions

public fun onCommitOptions(initializer: OnCommitOptions.Builder.() -> Unit): OnCommitOptions =
    OnCommitOptions.builder().apply(initializer).build()
